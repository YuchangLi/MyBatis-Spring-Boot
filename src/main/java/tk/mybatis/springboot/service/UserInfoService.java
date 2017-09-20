/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package tk.mybatis.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.springboot.mapper.OrderMapper;
import tk.mybatis.springboot.mapper.UserInfoMapper;
import tk.mybatis.springboot.model.Order;
import tk.mybatis.springboot.model.UserInfo;

import java.util.Date;
import java.util.List;

/**
 * @author liuzh
 * @since 2016-01-31 21:42
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private OrderMapper orderMapper;

    public List<UserInfo> getAll(UserInfo UserInfo) {
        if (UserInfo.getPage() != null && UserInfo.getRows() != null) {
            PageHelper.startPage(UserInfo.getPage(), UserInfo.getRows());
        }
        return userInfoMapper.selectAll();
    }

    public UserInfo getById(Integer id) {
      System.out.println(this.orderMapper.selectByPrimaryKey(1l));
        return null;
//        return userInfoMapper.selectByPrimaryKey(id);
    }
 
    public Object get(Integer id) {
//      return this.orderMapper.selectByPrimaryKey(1l);
//      PageHelper.startPage(2, 0, "ID DESC");
//      List<Order> list = orderMapper.selectAll();
//      PageInfo<Order> pageInfo = new PageInfo<Order>(list);
      Order record = new Order();
      record.setOrderNum("121312321");
      record.setContractId(123l);
      record.setTenderRecordId(11l);
      record.setBuyer(11l);
      record.setSupplier(11l);
      record.setCreateTime(new Date());
      record.setVersion(1);
      this.orderMapper.insertSelective(record);
      return record;
    }

    public void deleteById(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    public void save(UserInfo country) {
        if (country.getId() != null) {
            userInfoMapper.updateByPrimaryKey(country);
        } else {
            userInfoMapper.insert(country);
        }
    }
}
