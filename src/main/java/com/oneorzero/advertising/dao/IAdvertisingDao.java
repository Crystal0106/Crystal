package com.oneorzero.advertising.dao;

import java.util.List;

import com.oneorzero.bean.AdvertisingBean;

public interface IAdvertisingDao {
	List<AdvertisingBean> showOKAd();
	void deleteExpiredAd();
}
