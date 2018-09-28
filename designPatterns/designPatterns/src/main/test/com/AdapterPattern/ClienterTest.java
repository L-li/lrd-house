package com.AdapterPattern;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


/**
 * Clienter Tester.
 * 注意事项：
 * 　     1、测试方法上面必须使用@Test注解进行修饰。
 * <p>
 * 　　　　2、测试方法必须使用public void 进行修饰，不能带有任何参数。
 * <p>
 * 　　　　3、测试类的包应该与被测试类的包保持一致。
 * <p>
 * 　　　　4、测试单元中的每一个方法必须独立测试，每个测试方法之间不能有依赖。
 * <p>
 * 常用注解：
 * 　      1、@BeforeClass所修饰的方法在所有方法加载前执行，而且他是静态的在类加载后就会执行该方法，
 * <p>
 * 　　　　　在内存中只有一份实例，适合用来加载配置文件。
 * <p>
 * 　　　　2、@AfterClass所修饰的方法在所有方法执行完毕之后执行，通常用来进行资源清理，例如关闭数据库连接。
 * <p>
 * 　　　　3、@Before和@After在每个测试方法执行前都会执行一次。
 * <p>
 * 4、@Test(excepted=XX.class) 在运行时忽略某个异常。
 * <p>
 * 　　　 5、@Test(timeout=毫秒) 允许程序运行的时间。
 * <p>
 * 　　　 6、@Ignore 所修饰的方法被测试器忽略。
 */
public class ClienterTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * 类适配器模式
     */
    @Test
    public void testAdapterClass() throws Exception {
        Ps2 p = new Adapter();
        p.isPs2();

    }

    /**
     * 对象适配器模式
     */
    @Test
    public void testAdapterTarget() throws Exception {
        Ps2 p1 = new AdapterTarget(new Usber());
        p1.isPs2();
    }

    /**
     * 接口适配器模式
     */
    @Test
    public void testAdapterInterface() throws Exception {
        A a = new AAdapter();
        a.a();
        a.c();
    }


} 
