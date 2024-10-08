package com.seon.infra.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
	
	@Autowired
	ConcertDao concertDao;

}
