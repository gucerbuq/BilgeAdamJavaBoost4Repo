package com.bilgeadam.boost.week03.lesson003;

import java.util.Scanner;

public class TheBakkal {

	private static final int MAX_ITEMS = 5;
	private Scanner input;
	private Item[] items;
	private int itemCount;

	public static void main(String[] args) {

		TheBakkal bakkal = new TheBakkal();
		bakkal.itemCount = 0;
		bakkal.items = new Item[MAX_ITEMS];
		bakkal.menu();
		System.out.println("Bakkalımızı ziyaret ettiğiniz için teşekkürler");

	}

	private void menu() {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("==============");
			System.out.println("Kardeşler Gıda");
			System.out.println("==============");
			System.out.println("1 - Yeni ürün girişi");
			System.out.println("2 - Ürünleri listele");
			System.out.println("3 - Alışveriş yap");
			System.out.println("4 - Eve dön\n");
			System.out.println("Lütfen seçiminizi yapınız");
			int selection = this.input.nextInt();

			input.nextLine();

			if (selection == 4) {
				break;
			}
			if (!this.processSelection(selection)) {
				System.err.println("Yanlış seçim yaptınız. Lütfen tekraryaın!");
				continue;
			}
		}

	}

	private boolean processSelection(int selection) {
		boolean returnValue = true;

		switch (selection) {
		case 1:
			this.createGood();
			break;
		case 2:
			this.listGoods();
			break;
		case 3:
			System.out.println("Alışveriş yap");
			break;
		default:
			returnValue = false;
		}

		return false;
	}

	private void listGoods() {
		if (itemCount==0) {
			System.out.println("Depoda ürün yok");
			return;
		}
		
		for (int i=0; i< items.length; i++) {
			System.out.println(items[i]);
		}
	}

	private void createGood() {

		if (itemCount >= MAX_ITEMS) {
			System.err.println("Depoda yer kalmadı");
			return;
		}
		System.out.println("Yeni Ürün Girişi");
		System.out.println("=================\n");

		System.out.println("Ürün ismini giriniz : ");
		String itemName = input.nextLine();
		System.out.println("\nÜrün birimini giriniz : ");
		String unit = input.nextLine();
		System.out.println("\nÜrün birim fiyatını giriniz : ");
		Double unitPrice = input.nextDouble();
		System.out.println("KDV oranını giriniz : ");
		Double vat = input.nextDouble();

		Item item = new Item();
		item.setName(itemName);
		item.setUnit(unit);
		item.setUnitPrice(0);
		item.setVatRate(0);
		System.out.println();

		items[itemCount++] = item;
//		itemCount += 1;
//		itemCount = itemCount +1;
//		itemCount++;
		System.out.println(item);

	}

}
