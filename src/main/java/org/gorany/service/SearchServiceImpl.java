package org.gorany.service;

import java.util.List;

import org.gorany.domain.MenuVO;
import org.gorany.domain.StoreVO;
import org.gorany.mapper.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.java.Log;

@Service
@Log
public class SearchServiceImpl implements SearchService{

	@Setter(onMethod_=@Autowired)
	private SearchMapper mapper;

	@Override
	public List<String> getName() {
		
		List<String> menuName = mapper.getMenuName();
		List<String> storeName = mapper.getStoreName();
		
		List<String> list = menuName;
		list.addAll(storeName);
		
		return list;
	}


	@Override
	public List<MenuVO> searchMenu(String keyword) {
		// TODO Auto-generated method stub
		return mapper.searchMenu(keyword);
	}


	@Override
	public List<StoreVO> searchStore(String keyword) {
		
		return mapper.searchStore(keyword);
	}

}
