
public class OrderTest {

    @Test
    public void testUpdateOrder(){
        // 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.getUserById(1);
        order.setPassword("7891011");
        int updateIndex = orderMapper.updateUser(user);
    }
}
