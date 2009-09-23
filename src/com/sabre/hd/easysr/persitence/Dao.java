package com.sabre.hd.easysr.persitence;

public interface Dao {
	public void insert();
	public void update();
	public void delete();
	public void findByPK(String pk);
}
