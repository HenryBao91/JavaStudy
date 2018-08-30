package cp7.SL12;

interface DrawImage{     // 定义“画图形”接口
	public void draw() ;
}

class Rectangle implements DrawImage { // 矩形类实现了drawTest接口
	public void draw() { // 矩形类中实现draw()方法
		System.out.println("画矩形");
	}
}

class Square implements DrawImage { // 正方形类实现了drawTest接口
	public void draw() { // 正方形类中实现draw()方法
		System.out.println("画正方形");
	}
}

class Diamond implements DrawImage { // 菱形类实现了drawTest接口
	public void draw() { // 菱形类中实现draw()方法
		System.out.println("画菱形");
	}
}


public  class SpecialParallelogram {  // 定义特殊的平行四边形类

	public static void main(String[] args) {
		// 接口也可以进行向上转型操作
		DrawImage[] images = { new Rectangle(), new Square(), new Diamond() };
		// 遍历“画图形”接口类型的数组
		for (int i = 0; i < images.length; i++) {
			images[i].draw(); // 调用draw()方法
		}
	}

}
