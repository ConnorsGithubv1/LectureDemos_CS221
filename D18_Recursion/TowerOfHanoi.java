public class TowerOfHanoi {
    
    private int numberOfDisks;



    public void printSolutionInstructions() {
        //one Disk solution
        // moveOneDisk(1, 3);

        //two Disk solution
        //moveTwoDisk(1,2,3);

        //three disk solution
        //moveThreeDisk(1, 3, 2);

        //four disk solution
        //MoveFourDisks(1, 3, 2);

        //general solution
        moveTower(numberOfDisks, 1, 3, 2);
    }

    private void moveOneDisk(int start, int end){
        System.out.println("Move one disk from "+ start + " to " + end);
    }

    private void moveTwoDisk(int peg_start, int peg_end, int peg_temp){
        moveOneDisk(peg_start, peg_end); //small disk move (begin, extra)

        moveOneDisk(peg_start, peg_end); //larger disk move (begin, final)

        moveOneDisk(peg_temp, peg_end); //small disk move (extra, final)
    }

    private void moveThreeDisk(int peg_start, int peg_end, int peg_temp){
        // moveOneDisk(peg_start, peg_end); // small disk move from peg_start to peg_end (begin, extra)
        // moveOneDisk(peg_start, peg_temp); // larger disk move from peg_start to peg_temp (begin, final)
        // moveOneDisk(peg_end, peg_temp); // small disk move from peg_end to peg_temp (extra, extra)

        moveTwoDisk(peg_start, peg_temp, peg_end);

        moveOneDisk(peg_start, peg_end);

        // moveOneDisk(peg_temp, peg_start);
        // moveOneDisk(peg_temp, peg_end);
        // moveOneDisk(peg_start, peg_end);
        moveTwoDisk(peg_temp, peg_end, peg_start);
    }

    private void MoveFourDisks(int start, int end, int temp) {
        // moveOneDisk(start, temp);
        // moveOneDisk(start, end);
        // moveOneDisk(temp, end);
        // moveOneDisk(start, temp);
        // moveOneDisk(end, start);
        // moveOneDisk(end, temp);
        // moveOneDisk(start, temp);
        // same as --> 
        moveThreeDisk(start, temp, end);

        moveOneDisk(start, end);
        
        // moveOneDisk(temp, end);
        // moveOneDisk(temp, start);
        // moveOneDisk(end, start);
        // moveOneDisk(temp, end);
        // moveOneDisk(start, temp);
        // moveOneDisk(start, end);
        // moveOneDisk(temp, end);
        moveThreeDisk(temp, end, start);
    }

    private void moveTower(int numberOfDisks, int start, int end, int temp) {
        if (numberOfDisks == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numberOfDisks - 1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numberOfDisks - 1, temp, end, start);
        }
    }

}
