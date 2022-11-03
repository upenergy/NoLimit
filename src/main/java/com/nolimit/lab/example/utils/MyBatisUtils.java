public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param
     * @return
     * @description 获取 SqlSession 连接
     * @date 2020/7/14 11:46
     * @author cunyu1943
     * @version 1.0
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}
