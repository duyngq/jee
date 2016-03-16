package com.accedian.glassfish.movie.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table( name = "MOVIES" )
public class Movie implements Serializable {

    private static final long serialVersionUID = 4399627065640362466L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    @Size( min = 1, max = 200 )
    private String name;

    @Column
    @NotNull
    @Size( min = 1, max = 200 )
    private String actors;

    public Movie() {
    }

    public Movie( Long id ) {
	this.id = id;
    }

    public Movie( Long id, String name, String actors ) {
	this.id = id;
	this.name = name;
	this.actors = actors;
    }

    public Long getId() {
	return id;
    }

    public void setId( Long id ) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName( String name ) {
	this.name = name;
    }

    public String getActors() {
	return actors;
    }

    public void setActors( String actors ) {
	this.actors = actors;
    }

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (id != null ? id.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals( Object object ) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if ( !(object instanceof Movie) ) {
	    return false;
	}
	Movie other = (Movie) object;
	if ( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return name;
    }

}
