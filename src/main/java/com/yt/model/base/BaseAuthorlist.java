package com.yt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAuthorlist<M extends BaseAuthorlist<M>> extends Model<M> implements IBean {

	public M setAuthorlistId(java.lang.Integer authorlistId) {
		set("authorlist_id", authorlistId);
		return (M)this;
	}
	
	public java.lang.Integer getAuthorlistId() {
		return getInt("authorlist_id");
	}

	public M setAuthorlistUser(java.lang.Integer authorlistUser) {
		set("authorlist_user", authorlistUser);
		return (M)this;
	}
	
	public java.lang.Integer getAuthorlistUser() {
		return getInt("authorlist_user");
	}

	public M setAuthorlistName(java.lang.String authorlistName) {
		set("authorlist_name", authorlistName);
		return (M)this;
	}
	
	public java.lang.String getAuthorlistName() {
		return getStr("authorlist_name");
	}

	public M setAuthorlistPic(java.lang.String authorlistPic) {
		set("authorlist_pic", authorlistPic);
		return (M)this;
	}
	
	public java.lang.String getAuthorlistPic() {
		return getStr("authorlist_pic");
	}

	public M setAuthorlistDate(java.util.Date authorlistDate) {
		set("authorlist_date", authorlistDate);
		return (M)this;
	}
	
	public java.util.Date getAuthorlistDate() {
		return get("authorlist_date");
	}

}
