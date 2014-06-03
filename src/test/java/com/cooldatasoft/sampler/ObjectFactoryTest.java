package com.cooldatasoft.sampler;

import static org.junit.Assert.fail;

import java.util.Date;

import lombok.Data;

import org.junit.Test;

import com.cooldatasoft.sampler.ObjectFactory;

/**
 * 
 * @author Fatih Mehmet UCAR - fmucar@cooldatasoft.com
 * 
 */
public class ObjectFactoryTest {

	@Test
	public void testObjectFactory() {
		try {
			ObjectFactory.sample(TestEntity.class);
		} catch (Exception e) {
			fail("Should not have thrown exception");
			e.printStackTrace();
		}
	}

	@Data
	static class TestEntity {
		private String name;
		private String surname;
		private TestBalance balance;

	}

	@Data
	static class TestBalance {
		private String s;

		private Integer i;
		private int i2;

		private Double d;
		private double d2;

		private Float f;
		private float f2;

		private Short sh;
		private short sh2;

		private Boolean b;
		private boolean b2;

		private Byte by;
		private byte by2;

		private Long l;
		private long l2;

		private Character ch;
		private char ch2;

		private Date date;

		private int[] array;
		private double[] array2;
		private short[] array3;
		private float[] array4;
		private long[] array5;
		private char[] array6;
		private byte[] array7;
		private boolean[] array8;

		private Integer[] array9;
		private Double[] array10;
		private Short[] array11;
		private Float[] array12;
		private Long[] array13;
		private Character[] array14;
		private Byte[] array15;
		private Boolean[] array16;

	}
}
