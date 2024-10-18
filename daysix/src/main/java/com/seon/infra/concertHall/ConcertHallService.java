package com.seon.infra.concertHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertHallService {
	
	@Autowired
	ConcertHallDao concertHallDao;

}
