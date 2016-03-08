package CSTset4Ques1;

import java.util.ArrayList;

public class Djsub implements Subject {

    private ArrayList<DjRecHist> djRec;
    private ArrayList<String> dates;
    private ArrayList<Observer> observers;
    private int size;

    public Djsub() {
        observers = new ArrayList();
        djRec = new ArrayList();
        dates = new ArrayList();
       
    }

    public int getSize() {
        return size;
    }

    public ArrayList<DjRecHist> getList() {
        return djRec;
    }

    public ArrayList<String> getDates() {
        for (int i = 0; i < djRec.size(); i++) {
            dates.add(djRec.get(i).getDate().toString());
        }

        return dates;
    }

    public void addRecord(DjRecHist record) {
        djRec.add(record);
        size++;
        notifyObserver(djRec);
    }

    public void removeRecord(DjRecHist record) {
        djRec.remove(record);
        size--;
        notifyObserver(djRec);
    }

    public void displayRecords() {
        for (DjRecHist r : djRec) {
            System.out.println(r.toString());
        }
    }

    @Override
    public void notifyObserver(ArrayList<DjRecHist> records) {
        for (Observer o : observers) {
            o.update(records);
        }
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer existingObserver) {
        int index = observers.indexOf(existingObserver);
		observers.remove(index);
		System.out.println("Observer " + (index + 1) + " deleted.");
    }
}