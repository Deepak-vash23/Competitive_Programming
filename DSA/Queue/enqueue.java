package Queue;

public class enqueue {

    static int top = -1;
    static int que []= new int[5];
    static int n = que.length;
    static int front = -1;
    static int rear = -1;
    static void enqeue(int x){
        try {
            if (top == n - 1){
                System.out.println("overflow");
            }else{
                if (front == -1){
                    front = 0;
                    rear++;
                    que[rear] = x;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void delete(){
        if (front == -1 || front > rear){
            System.out.println("underflow");
        }else{
            int x = que[front];
            System.out.println(x + " deleted");
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }
    public static void main(String[] args) {
        enqeue(10);
        enqeue(20);
        enqeue(30);

        delete(); // 10 delete
        delete(); // 20 delete
    }
}
