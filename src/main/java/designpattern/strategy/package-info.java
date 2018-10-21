/**
 * @author wangrz
 * 解决问题：封装变化（程序中的算法）
 * 实现：使用context来完成对strategy创建，将strategy的不同实现进行分装
 * 优点：算法自由切换；避免多个条件语句；易于扩展
 * 缺点：策略类会增加；所有策略类对外暴露
 */
package designpattern.strategy;