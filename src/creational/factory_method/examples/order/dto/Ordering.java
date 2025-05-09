package creational.factory_method.examples.order.dto;

import java.util.Date;

public class Ordering {
	private Long orderingId;
	private Date orderDate;
	private Long accountId;
	private Long orderingContactKey;
	private Date orderExpiredDate;
	private int orderTypeId;
	private OrderType orderType;
	
	
	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public Long getOrderingId() {
		return orderingId;
	}

	public void setOrderingId(Long orderingId) {
		this.orderingId = orderingId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getOrderingContactKey() {
		return orderingContactKey;
	}

	public void setOrderingContactKey(Long orderingContactKey) {
		this.orderingContactKey = orderingContactKey;
	}

	public Date getOrderExpiredDate() {
		return orderExpiredDate;
	}

	public void setOrderExpiredDate(Date orderExpiredDate) {
		this.orderExpiredDate = orderExpiredDate;
	}

	public int getOrderTypeId() {
		return orderTypeId;
	}

	public void setOrderTypeId(int orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

    @Override
    public String toString()
    {
        return "Ordering [orderingId=" + orderingId + ", orderDate=" + orderDate + ", accountId=" + accountId + ", orderExpiredDate=" + orderExpiredDate + ", orderTypeId=" + orderTypeId + ", orderType=" + orderType + "]";
    }

	
}
