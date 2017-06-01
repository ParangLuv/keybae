package com.parangluv.keybae.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@MappedSuperclass
public class CommonDomain {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date regDate;								// 등록시간
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date modDate;								// 수정시간
	
	@Column(nullable = false, columnDefinition="bit(1) default 0")
	private boolean isDeleted;							// 논리삭제 여부
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date delDate;								// 삭제시간
	
	@Column
	private String extra1;								// 예비1
	
	@Column
	private int extra2; 								// 예비2
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date extra3;								// 예비3
	
	@Column
	private boolean extra4;								// 예비4

}
