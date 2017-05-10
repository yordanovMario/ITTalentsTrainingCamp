package office;

public class AllWork {
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork() {
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassignedTask = 0;
	}
	
	void addTask(Task task){
		for(int i = 0; i < tasks.length; i++){
			if(tasks[i] == null){
				tasks[i] = task;
				freePlacesForTasks--;
				return;
			}
		}
	}
	
	Task getNextTask(){
		if(this.currentUnassignedTask == this.tasks.length){
			System.out.println("No more tasks left!");
			return null;
		}
		return this.tasks[this.currentUnassignedTask];
	}
	
	boolean isAllWorkDone(){
		for(int i = 0; i < tasks.length; i++){
			if(tasks[i] != null){
				if(tasks[i].getWorkingHours() != 0){
					return false;
				}
			}
		}
		return true;
	}
	
	void setTaskHours(Task task, int hours){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i] == task && tasks[i] != null){
				tasks[i].setWorkingHours(hours);
			}
		}
	}
	
}
