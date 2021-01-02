package cn.itcast.chapter02.task01;
/**
 * 商城库存清单程序
 */
public class StoreList {
	public static void main(String[] args) {
		// 苹果笔记本电脑
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		String macConfig = "i5处理器4GB内存128G固态硬盘";
		int macCount = 5;

		// 联想Thinkpad笔记本电脑
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadSize = 14.0;
		double thinkpadPrice = 5999.99;
		String thinkpadConfig = "i5处理器4GB内存500G硬盘";
		int thinkpadCount = 10;

		// 华硕ASUS笔记本电脑
		String ASUSBrand = "ASUS-FL5800";
		double ASUSSize = 15.6;
		double ASUSPrice = 4999.50;
		String ASUSConfig = "i7处理器4GB内存128G固态硬盘";
		int ASUSCount = 18;

		// 列表顶部
		System.out.println("------------------------------商城库存清单"
				+ "-----------------------------");
		System.out.println("品牌型号		尺寸	价格		配置		库存数");

		// 列表中部
		System.out.println(macBrand + "	" + macSize + "	" + macPrice + "	"
				+ macConfig + "	" + macCount);
		System.out.println(thinkpadBrand + "	" + thinkpadSize + "	"
				+ thinkpadPrice + "	" + thinkpadConfig + "	" + thinkpadCount);
		System.out.println(ASUSBrand + "	" + ASUSSize + "	" + ASUSPrice + "	"
				+ ASUSConfig + "	" + ASUSCount);

		// 统计总库存数、库存总金额
		int totalCount = macCount + thinkpadCount + ASUSCount;
		double totalMoney = (macCount * macPrice)
				+ (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

		// 列表底部
		System.out.println("--------------------"
				+ "-----------------------------------------------");
		System.out.println("总库存数：" + totalCount);
		System.out.println("库存商品总金额：" + totalMoney);

	}
}