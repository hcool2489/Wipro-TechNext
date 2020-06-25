import java.util.Scanner;

class Video{
	private String videoName;
	private boolean checkout;
	private int rating;
	
	public Video(String name){
		videoName = name;
	}
	public String getName(){
		return videoName;
	}
	public void doCheckout(){
		checkout = true;
	}
	public void doReturn(){
		checkout = false;
	}
	public void receiveRating(int rating){
		this.rating = rating;
	}
	public int getRating(){
		return rating;
	}
	public boolean getCheckout(){
		return checkout;
	}
}
class VideoStore{
	private Video[] store = new Video[0];
	
	private Video[] addNew(Video obj){
		Video[] newArr = new Video[store.length + 1];
		int i;
		for(i=0;i<store.length;i++)
			newArr[i] = store[i];
		newArr[i] = obj;
		return newArr;
	}
	private int getIndex(String name){
		for(int i=0;i<store.length;i++)
			if(store[i].getName().equals(name))
				return i;
		return -1;
	}
	private boolean isEmpty(){
		if(store.length == 0)
			return true;
		return false;
	}
	public void addVideo(String name){
		store = addNew(new Video(name));
		System.out.println("Video \"" + name + "\" added successfully.");
	}
	public void doCheckout(String name){
		if(isEmpty()){
			System.out.println("\nStore Empty!");
			return;
		}
		int index = getIndex(name);
		if(index == -1){
			System.out.println("\nVideo not Found");
			return;
		}
		if(!store[index].getCheckout()){
			store[index].doCheckout();
			System.out.println("Video \"" + name + "\" checked out successfully.");
			return;
		}
		System.out.println("Video \"" + name + "\" not available in stock.");
	}
	public void doReturn(String name){
		if(isEmpty()){
			System.out.println("\nStore Empty!");
			return;
		}
		int index = getIndex(name);
		if(index == -1){
			System.out.println("\nVideo not Found");
			return;
		}
		if(store[index].getCheckout()){
			store[index].doReturn();
			System.out.println("Video \"" + name + "\" returned successfully.");
			return;
		}
		System.out.println("Video \"" + name + "\" already in stock.");
	}
	public void receiveRating(String name, int rating){
		if(isEmpty()){
			System.out.println("\nStore Empty!");
			return;
		}
		int index = getIndex(name);
		if(index == -1){
			System.out.println("\nVideo not Found");
			return;
		}
		store[index].receiveRating(rating);
	}
	public void listInventory(){
		if(isEmpty()){
			System.out.println("\nStore Empty!");
			return;
		}
		System.out.println("NAME\tRATING\tCHECKOUT\n-----------------------------------------------");
		for(int i=0;i<store.length;i++){
			System.out.println(store[i].getName() + "\t" + store[i].getRating() + "\t" + store[i].getCheckout());
		}
		System.out.println("-----------------------------------------------");
	}
}

public class VideoLauncher{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		VideoStore store20 = new VideoStore();
		String name;
		boolean showMenu = true;
		while(showMenu){
			System.out.print("\n\nMAIN MENU\n=========\n1. Add Videos:\n2. Check Out Video :\n3. Return Video :\n4. Receive Rating :\n5. List Inventory :\n6. Exit :\nEnter your choice (1..6): ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("\n\nEnter the name of the video you want to add: ");
					name = sc.next();
					store20.addVideo(name);
					break;
				case 2:
					System.out.print("\n\nEnter the name of the video you want to check out: ");
					name = sc.next();
					store20.doCheckout(name);
					break;
				case 3:
					System.out.print("\n\nEnter the name of the video you want to Return: ");
					name = sc.next();
					store20.doReturn(name);
					break;
				case 4:
					System.out.print("\n\nEnter the name of the video you want to Rate: ");
					name = sc.next();
					System.out.print("Enter the rating of this video: ");
					int rt = sc.nextInt();
					store20.receiveRating(name, rt);
					break;
				case 5:
					store20.listInventory();
					break;
				case 6:
					showMenu = false;
					break;
				default:
					System.out.println("\nEnter Correct Choice...");
			}
			System.out.println("\n.\n.\n.\n");
		}
		System.out.println("\nExiting...!! Thanks for using the application.");
	}
}