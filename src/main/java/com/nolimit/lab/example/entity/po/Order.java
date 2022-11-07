import com.nolimit.lab.example.entity.OrderStatusEnum;

import java.io.Serializable;

public class Order implements Serializable {

		
		private Long id;
		private String ordercode;
		private String orderNumber;
		private Long tenantId;
		private Long projectId;
		private String outTradeNo;
		private OrderStatusEnum type;
		private String orderName;
		
    //偏移量
    private Integer offset;
    //每页条数
    private Integer pageSize;
    //页数
    private Integer pageNum;
    // 计算分页的起始位置
    public Integer getOffset() {
        return ((pageNum == null || pageNum < 1 ? 1 : pageNum) - 1) * (pageSize == null ? 3 : pageSize);
    }

}