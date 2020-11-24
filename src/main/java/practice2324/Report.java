package practice2324;

public class Report {
    private int id;
    private int taskld;
    private String worker;
    private double result;

    public Report(int id, int taskld, String worker, double result) {
        this.id = id;
        this.taskld = taskld;
        this.worker = worker;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskld() {
        return taskld;
    }

    public void setTaskld(int taskld) {
        this.taskld = taskld;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
