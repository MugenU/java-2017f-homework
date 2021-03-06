package huluwa;

import java.util.*;

public class Huluwa {

	Admin[] Huluwa = new Admin[7];
	{
		Huluwa[0] = new Admin(1, "大娃", "红色");
		Huluwa[1] = new Admin(2, "二娃", "橙色");
		Huluwa[2] = new Admin(3, "三娃", "黄色");
		Huluwa[3] = new Admin(4, "四娃", "绿色");
		Huluwa[4] = new Admin(5, "五娃", "青色");
		Huluwa[5] = new Admin(6, "六娃", "蓝色");
		Huluwa[6] = new Admin(7, "七娃", "紫色");

	}

	public void Array() {//随机站队
		List<Admin> list = Arrays.asList(Huluwa);
		Collections.shuffle(list);

	}

	public void Sort() {//冒泡排序
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (Huluwa[i].get_no() < Huluwa[j].get_no()) {
					Admin temp = Huluwa[i];
					Huluwa[i] = Huluwa[j];
					Huluwa[j] = temp;
					Huluwa[i].report_position(i, j);
					Huluwa[j].report_position(j, i);
				}
			}
		}
	}
	public void FastSort(int low, int high) {//快速排序
		int temp = Huluwa[low].get_no();
		while (low < high) {
			while (low < high && Huluwa[high].get_no() > temp) {
				high--;
			}
			Huluwa[low] = Huluwa[high];
			Huluwa[high].report_position(high, low);
			Huluwa[low].report_position(low, high);
			while (low < high && Huluwa[low].get_no() < temp) {
				low++;
			}
			Huluwa[high] = Huluwa[low];
		}
		 Huluwa[low].no = temp;
		 Huluwa[high].report_position(high, low);
		 Huluwa[low].report_position(low, high);
	}
	public void PrintName() {//打印姓名
		for (int i = 0; i < 7; i++) {
			Huluwa[i].getName();
		}
	}
	public void PrintColor() {//打印颜色
		for (int i = 0; i < 7; i++) {
			Huluwa[i].getColor();
		}
	}
	public static void main(String[] args) {
		Huluwa huluwa = new Huluwa();
		huluwa.Array();
		huluwa.Sort();
		huluwa.PrintName();
		huluwa.Array();
		huluwa.FastSort(0, 6);
		huluwa.PrintColor();

	}

}