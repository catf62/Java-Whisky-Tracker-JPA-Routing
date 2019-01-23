package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskysByYear(){
		assertEquals(2, whiskyRepository.findWhiskyByYear(2018).size());
	}

	@Test
	public void findDistilleriesByRegion(){
		assertEquals(2, distilleryRepository.findDistilleryByRegion("Speyside").size());
	}

	@Test
	public void findWhiskyByDistilleryIdAndAge(){
		assertEquals(1, whiskyRepository.findWhiskyByDistilleryIdAndAge(1L, 15).size());
	}

	@Test
	public void findWhiskyByRegion(){
		assertEquals(1, whiskyRepository.findWhiskyByRegion("Speyside").size());
	}

}
