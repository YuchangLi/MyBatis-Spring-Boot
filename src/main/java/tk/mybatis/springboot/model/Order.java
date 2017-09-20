package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class Order {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 标id(t_tender.id)
     */
    @Column(name = "tender_id")
    private Long tenderId;

    /**
     * 投标记录id(t_tander_record.id)
     */
    @Column(name = "tender_record_id")
    private Long tenderRecordId;

    /**
     * 合同id(t_contract.id)
     */
    @Column(name = "contract_id")
    private Long contractId;

    /**
     * 需方id(t_user.id)
     */
    private Long buyer;

    /**
     * 需方公司id
     */
    @Column(name = "buyer_company_id")
    private Long buyerCompanyId;

    /**
     * 需方(用户或公司名)
     */
    @Column(name = "buyer_company_name")
    private String buyerCompanyName;

    /**
     * 供方id(t_user.id)
     */
    private Long supplier;

    /**
     * 供方公司id
     */
    @Column(name = "supplier_company_id")
    private Long supplierCompanyId;

    /**
     * 供方(用户或公司名)
     */
    @Column(name = "supplier_company_name")
    private String supplierCompanyName;

    /**
     * 状态:1待付款,2待提货,3(发货成功)待验收,4完成,5失败,6提货中(发货中)
     */
    private Byte status;

    /**
     * 创建时间(生成订单时间)
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 买家支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 买家提交时间(提货单)
     */
    @Column(name = "submit_time")
    private Date submitTime;

    /**
     * 发货截止时间(默认提交时间+4天,卖家可更新)
     */
    @Column(name = "delivery_end_time")
    private Date deliveryEndTime;

    /**
     * 实际发货时间(卖家更新)
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * 买家验收时间
     */
    @Column(name = "confirm_time")
    private Date confirmTime;

    /**
     * 提货联系人
     */
    @Column(name = "delivery_connect_name")
    private String deliveryConnectName;

    /**
     * 提货联系电话
     */
    @Column(name = "delivery_connect_phone")
    private String deliveryConnectPhone;

    /**
     * 提货联系备注
     */
    @Column(name = "delivery_connect_mark")
    private String deliveryConnectMark;

    /**
     * 提货单-提货日期(年-月-日)
     */
    @Column(name = "delivery_date")
    private Date deliveryDate;

    /**
     * 中标量(吨)
     */
    private BigDecimal quantity;

    /**
     * 单价(元/吨)
     */
    @Column(name = "buy_price")
    private BigDecimal buyPrice;

    /**
     * 总金额(元)
     */
    @Column(name = "sum_price")
    private BigDecimal sumPrice;

    /**
     * 提货次数
     */
    @Column(name = "order_delivery_count")
    private Integer orderDeliveryCount;

    /**
     * 买家申请提货总量(吨)
     */
    @Column(name = "total_submit_quantity")
    private BigDecimal totalSubmitQuantity;

    /**
     * 卖家已发货总量(吨)
     */
    @Column(name = "total_delivery_quantity")
    private BigDecimal totalDeliveryQuantity;

    /**
     * 实际已提货量(买家已验收,吨)
     */
    @Column(name = "finish_quantity")
    private BigDecimal finishQuantity;

    /**
     * 实际已提货总金额(买家已验收,元)
     */
    @Column(name = "finish_price")
    private BigDecimal finishPrice;

    /**
     * 定时任务下次执行时间
     */
    @Column(name = "next_update_time")
    private Date nextUpdateTime;

    /**
     * 修改延时提货时间的次数
     */
    @Column(name = "delay_delivery_count")
    private Integer delayDeliveryCount;

    /**
     * 订单取消时间
     */
    @Column(name = "cancel_time")
    private Date cancelTime;

    /**
     * 商品类型：1石油焦，2锻后焦
     */
    @Column(name = "petrol_type")
    private Byte petrolType;

    /**
     * 类型：1供给标订单,2需求标订单
     */
    private Byte type;

    /**
     * 支付方式:0线下,1余额,2银行转账,3余额+银行转账
     */
    @Column(name = "pay_type")
    private Byte payType;

    /**
     * 网银支付状态:1支付中,2已成功,3已失败
     */
    @Column(name = "third_pay_status")
    private Byte thirdPayStatus;

    /**
     * 1:凭证审核中,2:凭证未通过,3:凭证已通过(线下支付才有)
     */
    @Column(name = "certificate_status")
    private Byte certificateStatus;

    /**
     * 买家已支付金额
     */
    @Column(name = "payed_price")
    private BigDecimal payedPrice;

    /**
     * 打包方式:1散货,2吨袋
     */
    @Column(name = "pack_type")
    private Byte packType;

    /**
     * 优惠券金额
     */
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 吨袋总价格
     */
    @Column(name = "bag_amount")
    private BigDecimal bagAmount;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_num - 订单编号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单编号
     *
     * @param orderNum 订单编号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取标id(t_tender.id)
     *
     * @return tender_id - 标id(t_tender.id)
     */
    public Long getTenderId() {
        return tenderId;
    }

    /**
     * 设置标id(t_tender.id)
     *
     * @param tenderId 标id(t_tender.id)
     */
    public void setTenderId(Long tenderId) {
        this.tenderId = tenderId;
    }

    /**
     * 获取投标记录id(t_tander_record.id)
     *
     * @return tender_record_id - 投标记录id(t_tander_record.id)
     */
    public Long getTenderRecordId() {
        return tenderRecordId;
    }

    /**
     * 设置投标记录id(t_tander_record.id)
     *
     * @param tenderRecordId 投标记录id(t_tander_record.id)
     */
    public void setTenderRecordId(Long tenderRecordId) {
        this.tenderRecordId = tenderRecordId;
    }

    /**
     * 获取合同id(t_contract.id)
     *
     * @return contract_id - 合同id(t_contract.id)
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * 设置合同id(t_contract.id)
     *
     * @param contractId 合同id(t_contract.id)
     */
    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    /**
     * 获取需方id(t_user.id)
     *
     * @return buyer - 需方id(t_user.id)
     */
    public Long getBuyer() {
        return buyer;
    }

    /**
     * 设置需方id(t_user.id)
     *
     * @param buyer 需方id(t_user.id)
     */
    public void setBuyer(Long buyer) {
        this.buyer = buyer;
    }

    /**
     * 获取需方公司id
     *
     * @return buyer_company_id - 需方公司id
     */
    public Long getBuyerCompanyId() {
        return buyerCompanyId;
    }

    /**
     * 设置需方公司id
     *
     * @param buyerCompanyId 需方公司id
     */
    public void setBuyerCompanyId(Long buyerCompanyId) {
        this.buyerCompanyId = buyerCompanyId;
    }

    /**
     * 获取需方(用户或公司名)
     *
     * @return buyer_company_name - 需方(用户或公司名)
     */
    public String getBuyerCompanyName() {
        return buyerCompanyName;
    }

    /**
     * 设置需方(用户或公司名)
     *
     * @param buyerCompanyName 需方(用户或公司名)
     */
    public void setBuyerCompanyName(String buyerCompanyName) {
        this.buyerCompanyName = buyerCompanyName;
    }

    /**
     * 获取供方id(t_user.id)
     *
     * @return supplier - 供方id(t_user.id)
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * 设置供方id(t_user.id)
     *
     * @param supplier 供方id(t_user.id)
     */
    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    /**
     * 获取供方公司id
     *
     * @return supplier_company_id - 供方公司id
     */
    public Long getSupplierCompanyId() {
        return supplierCompanyId;
    }

    /**
     * 设置供方公司id
     *
     * @param supplierCompanyId 供方公司id
     */
    public void setSupplierCompanyId(Long supplierCompanyId) {
        this.supplierCompanyId = supplierCompanyId;
    }

    /**
     * 获取供方(用户或公司名)
     *
     * @return supplier_company_name - 供方(用户或公司名)
     */
    public String getSupplierCompanyName() {
        return supplierCompanyName;
    }

    /**
     * 设置供方(用户或公司名)
     *
     * @param supplierCompanyName 供方(用户或公司名)
     */
    public void setSupplierCompanyName(String supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
    }

    /**
     * 获取状态:1待付款,2待提货,3(发货成功)待验收,4完成,5失败,6提货中(发货中)
     *
     * @return status - 状态:1待付款,2待提货,3(发货成功)待验收,4完成,5失败,6提货中(发货中)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态:1待付款,2待提货,3(发货成功)待验收,4完成,5失败,6提货中(发货中)
     *
     * @param status 状态:1待付款,2待提货,3(发货成功)待验收,4完成,5失败,6提货中(发货中)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间(生成订单时间)
     *
     * @return create_time - 创建时间(生成订单时间)
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(生成订单时间)
     *
     * @param createTime 创建时间(生成订单时间)
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取买家支付时间
     *
     * @return pay_time - 买家支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置买家支付时间
     *
     * @param payTime 买家支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取买家提交时间(提货单)
     *
     * @return submit_time - 买家提交时间(提货单)
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 设置买家提交时间(提货单)
     *
     * @param submitTime 买家提交时间(提货单)
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 获取发货截止时间(默认提交时间+4天,卖家可更新)
     *
     * @return delivery_end_time - 发货截止时间(默认提交时间+4天,卖家可更新)
     */
    public Date getDeliveryEndTime() {
        return deliveryEndTime;
    }

    /**
     * 设置发货截止时间(默认提交时间+4天,卖家可更新)
     *
     * @param deliveryEndTime 发货截止时间(默认提交时间+4天,卖家可更新)
     */
    public void setDeliveryEndTime(Date deliveryEndTime) {
        this.deliveryEndTime = deliveryEndTime;
    }

    /**
     * 获取实际发货时间(卖家更新)
     *
     * @return delivery_time - 实际发货时间(卖家更新)
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置实际发货时间(卖家更新)
     *
     * @param deliveryTime 实际发货时间(卖家更新)
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取买家验收时间
     *
     * @return confirm_time - 买家验收时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置买家验收时间
     *
     * @param confirmTime 买家验收时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取提货联系人
     *
     * @return delivery_connect_name - 提货联系人
     */
    public String getDeliveryConnectName() {
        return deliveryConnectName;
    }

    /**
     * 设置提货联系人
     *
     * @param deliveryConnectName 提货联系人
     */
    public void setDeliveryConnectName(String deliveryConnectName) {
        this.deliveryConnectName = deliveryConnectName;
    }

    /**
     * 获取提货联系电话
     *
     * @return delivery_connect_phone - 提货联系电话
     */
    public String getDeliveryConnectPhone() {
        return deliveryConnectPhone;
    }

    /**
     * 设置提货联系电话
     *
     * @param deliveryConnectPhone 提货联系电话
     */
    public void setDeliveryConnectPhone(String deliveryConnectPhone) {
        this.deliveryConnectPhone = deliveryConnectPhone;
    }

    /**
     * 获取提货联系备注
     *
     * @return delivery_connect_mark - 提货联系备注
     */
    public String getDeliveryConnectMark() {
        return deliveryConnectMark;
    }

    /**
     * 设置提货联系备注
     *
     * @param deliveryConnectMark 提货联系备注
     */
    public void setDeliveryConnectMark(String deliveryConnectMark) {
        this.deliveryConnectMark = deliveryConnectMark;
    }

    /**
     * 获取提货单-提货日期(年-月-日)
     *
     * @return delivery_date - 提货单-提货日期(年-月-日)
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置提货单-提货日期(年-月-日)
     *
     * @param deliveryDate 提货单-提货日期(年-月-日)
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * 获取中标量(吨)
     *
     * @return quantity - 中标量(吨)
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置中标量(吨)
     *
     * @param quantity 中标量(吨)
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取单价(元/吨)
     *
     * @return buy_price - 单价(元/吨)
     */
    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    /**
     * 设置单价(元/吨)
     *
     * @param buyPrice 单价(元/吨)
     */
    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * 获取总金额(元)
     *
     * @return sum_price - 总金额(元)
     */
    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    /**
     * 设置总金额(元)
     *
     * @param sumPrice 总金额(元)
     */
    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    /**
     * 获取提货次数
     *
     * @return order_delivery_count - 提货次数
     */
    public Integer getOrderDeliveryCount() {
        return orderDeliveryCount;
    }

    /**
     * 设置提货次数
     *
     * @param orderDeliveryCount 提货次数
     */
    public void setOrderDeliveryCount(Integer orderDeliveryCount) {
        this.orderDeliveryCount = orderDeliveryCount;
    }

    /**
     * 获取买家申请提货总量(吨)
     *
     * @return total_submit_quantity - 买家申请提货总量(吨)
     */
    public BigDecimal getTotalSubmitQuantity() {
        return totalSubmitQuantity;
    }

    /**
     * 设置买家申请提货总量(吨)
     *
     * @param totalSubmitQuantity 买家申请提货总量(吨)
     */
    public void setTotalSubmitQuantity(BigDecimal totalSubmitQuantity) {
        this.totalSubmitQuantity = totalSubmitQuantity;
    }

    /**
     * 获取卖家已发货总量(吨)
     *
     * @return total_delivery_quantity - 卖家已发货总量(吨)
     */
    public BigDecimal getTotalDeliveryQuantity() {
        return totalDeliveryQuantity;
    }

    /**
     * 设置卖家已发货总量(吨)
     *
     * @param totalDeliveryQuantity 卖家已发货总量(吨)
     */
    public void setTotalDeliveryQuantity(BigDecimal totalDeliveryQuantity) {
        this.totalDeliveryQuantity = totalDeliveryQuantity;
    }

    /**
     * 获取实际已提货量(买家已验收,吨)
     *
     * @return finish_quantity - 实际已提货量(买家已验收,吨)
     */
    public BigDecimal getFinishQuantity() {
        return finishQuantity;
    }

    /**
     * 设置实际已提货量(买家已验收,吨)
     *
     * @param finishQuantity 实际已提货量(买家已验收,吨)
     */
    public void setFinishQuantity(BigDecimal finishQuantity) {
        this.finishQuantity = finishQuantity;
    }

    /**
     * 获取实际已提货总金额(买家已验收,元)
     *
     * @return finish_price - 实际已提货总金额(买家已验收,元)
     */
    public BigDecimal getFinishPrice() {
        return finishPrice;
    }

    /**
     * 设置实际已提货总金额(买家已验收,元)
     *
     * @param finishPrice 实际已提货总金额(买家已验收,元)
     */
    public void setFinishPrice(BigDecimal finishPrice) {
        this.finishPrice = finishPrice;
    }

    /**
     * 获取定时任务下次执行时间
     *
     * @return next_update_time - 定时任务下次执行时间
     */
    public Date getNextUpdateTime() {
        return nextUpdateTime;
    }

    /**
     * 设置定时任务下次执行时间
     *
     * @param nextUpdateTime 定时任务下次执行时间
     */
    public void setNextUpdateTime(Date nextUpdateTime) {
        this.nextUpdateTime = nextUpdateTime;
    }

    /**
     * 获取修改延时提货时间的次数
     *
     * @return delay_delivery_count - 修改延时提货时间的次数
     */
    public Integer getDelayDeliveryCount() {
        return delayDeliveryCount;
    }

    /**
     * 设置修改延时提货时间的次数
     *
     * @param delayDeliveryCount 修改延时提货时间的次数
     */
    public void setDelayDeliveryCount(Integer delayDeliveryCount) {
        this.delayDeliveryCount = delayDeliveryCount;
    }

    /**
     * 获取订单取消时间
     *
     * @return cancel_time - 订单取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置订单取消时间
     *
     * @param cancelTime 订单取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 获取商品类型：1石油焦，2锻后焦
     *
     * @return petrol_type - 商品类型：1石油焦，2锻后焦
     */
    public Byte getPetrolType() {
        return petrolType;
    }

    /**
     * 设置商品类型：1石油焦，2锻后焦
     *
     * @param petrolType 商品类型：1石油焦，2锻后焦
     */
    public void setPetrolType(Byte petrolType) {
        this.petrolType = petrolType;
    }

    /**
     * 获取类型：1供给标订单,2需求标订单
     *
     * @return type - 类型：1供给标订单,2需求标订单
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型：1供给标订单,2需求标订单
     *
     * @param type 类型：1供给标订单,2需求标订单
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取支付方式:0线下,1余额,2银行转账,3余额+银行转账
     *
     * @return pay_type - 支付方式:0线下,1余额,2银行转账,3余额+银行转账
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 设置支付方式:0线下,1余额,2银行转账,3余额+银行转账
     *
     * @param payType 支付方式:0线下,1余额,2银行转账,3余额+银行转账
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取网银支付状态:1支付中,2已成功,3已失败
     *
     * @return third_pay_status - 网银支付状态:1支付中,2已成功,3已失败
     */
    public Byte getThirdPayStatus() {
        return thirdPayStatus;
    }

    /**
     * 设置网银支付状态:1支付中,2已成功,3已失败
     *
     * @param thirdPayStatus 网银支付状态:1支付中,2已成功,3已失败
     */
    public void setThirdPayStatus(Byte thirdPayStatus) {
        this.thirdPayStatus = thirdPayStatus;
    }

    /**
     * 获取1:凭证审核中,2:凭证未通过,3:凭证已通过(线下支付才有)
     *
     * @return certificate_status - 1:凭证审核中,2:凭证未通过,3:凭证已通过(线下支付才有)
     */
    public Byte getCertificateStatus() {
        return certificateStatus;
    }

    /**
     * 设置1:凭证审核中,2:凭证未通过,3:凭证已通过(线下支付才有)
     *
     * @param certificateStatus 1:凭证审核中,2:凭证未通过,3:凭证已通过(线下支付才有)
     */
    public void setCertificateStatus(Byte certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    /**
     * 获取买家已支付金额
     *
     * @return payed_price - 买家已支付金额
     */
    public BigDecimal getPayedPrice() {
        return payedPrice;
    }

    /**
     * 设置买家已支付金额
     *
     * @param payedPrice 买家已支付金额
     */
    public void setPayedPrice(BigDecimal payedPrice) {
        this.payedPrice = payedPrice;
    }

    /**
     * 获取打包方式:1散货,2吨袋
     *
     * @return pack_type - 打包方式:1散货,2吨袋
     */
    public Byte getPackType() {
        return packType;
    }

    /**
     * 设置打包方式:1散货,2吨袋
     *
     * @param packType 打包方式:1散货,2吨袋
     */
    public void setPackType(Byte packType) {
        this.packType = packType;
    }

    /**
     * 获取优惠券金额
     *
     * @return coupon_amount - 优惠券金额
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置优惠券金额
     *
     * @param couponAmount 优惠券金额
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取吨袋总价格
     *
     * @return bag_amount - 吨袋总价格
     */
    public BigDecimal getBagAmount() {
        return bagAmount;
    }

    /**
     * 设置吨袋总价格
     *
     * @param bagAmount 吨袋总价格
     */
    public void setBagAmount(BigDecimal bagAmount) {
        this.bagAmount = bagAmount;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}