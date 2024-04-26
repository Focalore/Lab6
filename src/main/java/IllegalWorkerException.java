public class IllegalWorkerException extends RuntimeException {
    public IllegalWorkerException(){
        super ("This employee has been fired and can not work.");
    }
}