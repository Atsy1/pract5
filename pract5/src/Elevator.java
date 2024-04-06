public class Elevator {

        private int currentFloor;

        private int minFloor;

        private  int maxFloor;

        public Elevator( int minFloor, int maxFloor){

            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
            this.currentFloor=1;
        }

    public int getCurrentFloor() {
        return currentFloor;
    }

        public void moveDown(){
            if(currentFloor > minFloor){
                currentFloor--;
                System.out.println("Лифт спустился на этаж"+ currentFloor);
            } else {
                System.out.println("Лифт уже на минимальном этаже");
            }
        }

        public void moveUp(){
            if(currentFloor < maxFloor){
                currentFloor++;
                System.out.println("Лифт поднялся на этаж" + currentFloor);
            } else {
                System.out.println("Лифт уже на максимальном этаже");
            }
        }
        public void move(int floor){
            if (floor < minFloor || floor > maxFloor){
                System.out.println("Такого этажа нет");
                return;
            }

            while (currentFloor != floor){
                if (currentFloor < floor){
                    moveUp();
                } else {
                    moveDown();
                }
            }
        }










    public String toString(){

            return currentFloor+ " - " + minFloor + " - " + maxFloor ;
    }

    public void print(){
        String info = currentFloor + " - " + minFloor + " - " + maxFloor;
        System.out.println(info);
    }

}
