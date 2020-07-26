package hwjava05_seoul_class8_baekyujeong;

import java.util.Scanner;

public class ProductTest {
	
	static ProductMgr list  = ProductMgr.getInstance();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = 1;
		while(n != 0) {
			System.out.println();
			System.out.println("<<< ��� ���� ���α׷� >>>");
			System.out.println("1. ��ǰ ���� �Է�"); 
			System.out.println("2. ��ǰ ���� ��ü �˻�");
			System.out.println("3. ��ǰ ��ȣ �˻�");
			System.out.println("4. ��ǰ ���� ����");
			System.out.println("5. Ư�� ���� ���� ��ǰ �˻�");
			System.out.println("0. ����");
			System.out.println("���ϴ� ��ȣ�� �����ϼ���.");
			n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 0:
				System.out.println("�����մϴ�.");
				break;
			case 1:
				add_product();
				break;
			case 2:
				print_all();
				break;
			case 3:
				print_num();
				break;
			case 4:
				System.out.println("�����ϰ��� �ϴ� ��ǰ��ȣ : ");
				int num = sc.nextInt();
				list.delete(num);
				break;
			case 5:
				print_lowprice();
				break;
			default:
				System.out.println("Unavailable Choice");
				break;
			}
		}
	}
	
	public static void add_product() {
		System.out.println("1. ��ǰ ���� �Է�");
		System.out.print("��ǰ��ȣ : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		int stock = sc.nextInt();
		sc.nextLine();
		
		Product p = new Product(num, name, price, stock);
		list.add(p);
	}
	
	public static void print_all() {
		System.out.println();
		Product [] products = new Product[100];
		products = list.list();
		for(int i=0; i<list.getSize(); ++i) {
			System.out.println(products[i]);
		}
	}
	
	public static void print_num() {
		System.out.println("3. ��ǰ ��ȣ �˻�");
		System.out.println("��ǰ��ȣ : ");
		int num = sc.nextInt();
		int size = list.list(num).length;
		System.out.println(size);
		Product [] products;
		products = list.list(num);
		for(int i=0; i<size; ++i) {
			System.out.println(products[i]);
		}
	}
	
	public static void print_lowprice() {
		System.out.println("5. Ư�� ���� ���� ��ǰ �˻�");
		System.out.println("���� : ");
		int price = sc.nextInt();
		int size = list.priceList(price).length;
		Product [] products;
		products = list.priceList(price);
		for(int i=0; i<size; ++i) {
			System.out.println(products[i]);
		}
	}

}
