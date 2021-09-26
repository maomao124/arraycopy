/**
 * Project name(项目名称)：arraycopy() 方法
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 19:12
 * Version(版本): 1.0
 * Description(描述)：
 * arraycopy() 方法位于 java.lang.System 类中，其语法形式如下：
 * System.arraycopy(dataType[] srcArray,int srcIndex,int destArray,int destIndex,int length)
 * 其中，srcArray 表示原数组；srcIndex 表示原数组中的起始索引；
 * destArray 表示目标数组；destIndex 表示目标数组中的起始索引；length 表示要复制的数组长度。
 * 使用此方法复制数组时，length+srcIndex 必须小于等于 srcArray.length，
 * 同时 length+destIndex 必须小于等于 destArray.length。
 * 注意：目标数组必须已经存在，且不会被重构，相当于替换目标数组中的部分元素。
 * 假设在 scores 数组中保存了 8 名学生的成绩信息，现在需要复制该数组从第二个元素开始到结尾的所有元素到一个名称为 newScores 的数组中，
 * 长度为 12。scores 数组中的元素在 newScores 数组中从第三个元素开始排列。
 */

public class test
{
    public static void main(String[] args)
    {
        int scores[] = new int[]{1, 8, 7, 6, 5, 7, 6, 11, 23};
        int newscores[] = new int[]{5, 7, 8, 7, 9, 4, 5, 6, 9, 8, 7, 4, 5, 1, 2, 3, 5};
        System.out.println("原数组的内容如下：");
        for (int i : scores)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("目标数组如下：");
        for (int i : newscores)
        {
            System.out.print(i + "\t");
        }
        System.arraycopy(scores, 0, newscores, 2, 8);
        System.out.println();
        System.out.println("替换后的目标数组内容如下：");
        for (int i : newscores)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
