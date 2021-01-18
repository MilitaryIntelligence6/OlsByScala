package cn.misection.ols


import cn.misection.ols.entity.MyOls


/**
 * @ClassName App
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月15日 22:35:00
 */
object Application
{
    def main(args: Array[String]): Unit =
    {
        val path: String = "src/main/resources/arff/olsData.arff";
        val y: String = "y";

        println(new MyOls().regress(path, y));
        return 0;
    }
}
