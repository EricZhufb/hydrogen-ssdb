package com.hyd.ssdb;


import org.junit.Assert;
import org.junit.Test;

public class BytesMapTest extends BaseTest {

	@Test
	public void test(){
		super.ssdbClient.hset("test", "f1", new byte[]{1,2,3});
		byte[] bytes = ssdbClient.hgetBytes("test", "f1");
		Assert.assertTrue(bytes.length == 3);
	}
}
