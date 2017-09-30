package shiro_hibernate.ehcache;


import org.junit.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.core.io.ClassPathResource;

import com.blake.entiyi.User;

public class SpringCache {
	
	@Test
	public void isit()throws Exception{
        //�����ײ�Cache  
        net.sf.ehcache.CacheManager ehcacheManager  
                = new net.sf.ehcache.CacheManager(new ClassPathResource("eh/ehcache.xml").getInputStream());  
      
        //����Spring��CacheManager  
        EhCacheCacheManager cacheCacheManager = new EhCacheCacheManager();  
        //���õײ��CacheManager  
        cacheCacheManager.setCacheManager(ehcacheManager);  
      
        Long id = 1L;  
        User user =  new User();
        user.setLocked(true);
        user.setUid(2);
        user.setPassword("123456");
        user.setUsername("zhou");
      
        //���ݻ������ֻ�ȡCache  
        Cache cache = cacheCacheManager.getCache("user");  
        //������д����  
        cache.put(id, user);  
        //�ӻ��������  
        User user2 = cache.get(id,User.class);
        System.out.println("user:"+user2);
	}
}
