package com.Transport;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InjectionList  {

	private String names;
	private List<String> namelist;
	private Set<String> nameset;
	private Map<Integer,String> namemap;
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public List<String> getNamelist() {
		return namelist;
	}
	public void setNamelist(List<String> namelist) {
		this.namelist = namelist;
	}
	public void showList() {
		System.out.println(names);
		Iterator it=namelist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public Set<String> getNameset() {
		return nameset;
	}
	public void setNameset(Set<String> nameset) {
		this.nameset = nameset;
	}
	
	public void showSet() {
		System.out.println(names);
		Iterator it=nameset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public Map<Integer,String> getNamemap() {
		return namemap;
	}
	public void setNamemap(Map<Integer,String> namemap) {
		this.namemap = namemap;
	}
	
	public void showmap() {
		System.out.println(names);
		Set<Entry<Integer, String>> s=namemap.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			 Entry<Integer, String> entry= (Entry<Integer, String>) it.next();  
			System.out.println(entry.getKey()+" ,"+entry.getValue());
		}
		
	}
}
