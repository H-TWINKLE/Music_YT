package com.yt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCollection<M extends BaseCollection<M>> extends Model<M> implements IBean {

	public M setCollectionId(java.lang.Integer collectionId) {
		set("collection_id", collectionId);
		return (M)this;
	}
	
	public java.lang.Integer getCollectionId() {
		return getInt("collection_id");
	}

	public M setCollectionMusic(java.lang.Integer collectionMusic) {
		set("collection_music", collectionMusic);
		return (M)this;
	}
	
	public java.lang.Integer getCollectionMusic() {
		return getInt("collection_music");
	}

	public M setCollectionUser(java.lang.Integer collectionUser) {
		set("collection_user", collectionUser);
		return (M)this;
	}
	
	public java.lang.Integer getCollectionUser() {
		return getInt("collection_user");
	}

	public M setCollectionUpdateDate(java.util.Date collectionUpdateDate) {
		set("collection_update_date", collectionUpdateDate);
		return (M)this;
	}
	
	public java.util.Date getCollectionUpdateDate() {
		return get("collection_update_date");
	}

}