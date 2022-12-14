package djpf.master.ureport2.ureport.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息
 *
 * @author DJPF开发平台组
 * @version V3.0.0
 * @copyright 大吉信息技术有限公司
 * @date 2019年9月26日 上午9:18
 */
@Data
public class UserEntity {
    /**
     * 用户主键
     */
    private String id;
    /**
     * 账户
     */
    private String account;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 快速查询
     */
    private String quickQuery;

    /**
     * 呢称
     */
    private String nickName;

    /**
     * 头像
     */
    private String headIcon;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 手机
     */
    private String mobilePhone;

    /**
     * 电话
     */
    private String telePhone;

    /**
     * F_Landline
     */
    private String landline;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 民族
     */
    private String nation;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 入职日期
     */
    private Date entryDate;

    /**
     * 证件类型
     */
    private String certificatesType;

    /**
     * 证件号码
     */
    private String certificatesNumber;

    /**
     * 文化程度
     */
    private String education;

    /**
     * F_UrgentContacts
     */
    private String urgentContacts;

    /**
     * 紧急电话
     */
    private String urgentTelePhone;

    /**
     * 通讯地址
     */
    private String postalAddress;

    /**
     * 自我介绍
     */
    private String signature;

    /**
     * 密码
     */
    private String password;

    /**
     * 秘钥
     */
    private String secretkey;

    /**
     * 首次登录时间
     */
    private Date irstLogTime;

    /**
     * 首次登录IP
     */
    private String irstLogIP;

    /**
     * 前次登录时间
     */
    private Date prevLogTime;

    /**
     * 前次登录IP
     */
    private String prevLogIP;

    /**
     * 最后登录时间
     */
    private Date lastLogTime;

    /**
     * 最后登录IP
     */
    private String lastLogIP;

    /**
     * 登录成功次数
     */
    private Integer logSuccessCount;

    /**
     * 登录错误次数
     */
    private Integer logErrorCount;

    /**
     * 最后修改密码时间
     */
    private Date changePasswordDate;

    /**
     * 系统语言
     */
    private String language;

    /**
     * 系统样式
     */
    private String theme;

    /**
     * 常用菜单
     */
    private String commonMenu;

    /**
     * 是否管理员
     */
    private Integer isAdministrator;

    /**
     * 扩展属性
     */
    private String propertyJson;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序码
     */
    private Long sortCode;

    /**
     * 有效标志
     */
    private Integer enabledMark;

    /**
     * 创建时间
     */
    private Date creatorTime;

    /**
     * 创建用户
     */
    private String creatorUserId;

    /**
     * 修改时间
     */
    private Date lastModifyTime;

    /**
     * 修改用户
     */
    private String lastModifyUserId;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除用户
     */
    private String deleteUserId;

    /**
     * 删除标志
     */
    private Integer deleteMark;

    /**
     * 主管主键
     */
    private String managerId;

    /**
     * 组织主键
     */
    private String organizeId;

    /**
     * 岗位主键
     */
    private String positionId;

    /**
     * 角色主键
     */
    private String roleId;

    /**
     * 角色主键
     */
    private String portalId;


}
