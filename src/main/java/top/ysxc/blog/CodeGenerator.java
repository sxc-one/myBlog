package top.ysxc.blog;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ysxc
 * @create 2021-05-21 4:59 下午
 */
public class CodeGenerator {

    /**
     * 生成代码时请确认以下常量配置是否符合要求
     */

    private static final String MODULE_NAME = "";
    private static final String PACKAGE_NAME = "top.ysxc.blog.dao";
    private static final String DATABASE_NAME = "myblog";
    /**
     * 设置要生成的表
     */
    private static final String[] INCLUDE = Arrays.asList("enum_test", "enum_test2").toArray(new String[]{});

    /**
     * 枚举配置
     */
//    private static final Map<String, Object> ENUMS_CONFIG ;

    /**
     * Controller url前缀,不需要以/开头，会自动添加开头的/
     */
    private static final String CONTROLLER_URL_PREFIX = "generate";
    /**
     * 类前缀
     */
    private static final String CLASS_PREFIX = "Generate";

    private static final String DATABASE_HOST = "localhost";
    private static final String DATABASE_PORT = "3306";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "111111";

    /**
     * 初始化枚举配置
     */
//    static {
//        Map<String, Object> map = new HashMap<>();
//        // key为 表名.字段名称
//        // value为枚举的完整类路径
//        map.put("enum_test.sex", "cn.cloudcare.cloudflux.samples.mybatisplus.enums.enums.SexEnum");
//        map.put("enum_test2.sex", "cn.cloudcare.cloudflux.samples.mybatisplus.enums.enums.SexEnum2");
//        ENUMS_CONFIG = map;
//    }


    public static void main(String[] args) throws URISyntaxException {
        new CodeGenerator().generateCode();
    }

    /**
     * 生成代码
     */
    public void generateCode() throws URISyntaxException {
        AutoGenerator generator = new AutoGenerator();
        generator.setDataSource(dataSourceConfig());
        generator.setGlobalConfig(globalConfig());
        generator.setPackageInfo(packageConfig());
        generator.setStrategy(strategyConfig());
        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        generator.setTemplate(templateConfig());
        generator.setCfg(customerCfg());
        generator.execute();
    }

    /**
     * 数据源配置
     */
    private DataSourceConfig dataSourceConfig() {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(String.format("jdbc:mysql://%s:%s/%s?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&autoReconnect=true", DATABASE_HOST, DATABASE_PORT, DATABASE_NAME));
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername(DATABASE_USERNAME);
        dataSourceConfig.setPassword(DATABASE_PASSWORD);
        return dataSourceConfig;
    }

    /**
     * 全局配置
     */
    private GlobalConfig globalConfig() throws URISyntaxException {
        GlobalConfig globalConfig = new GlobalConfig();
        String currentPath = this.getClass().getResource("/").toURI().getPath().substring(1);
        System.out.println(currentPath);
//        globalConfig.setOutputDir(currentPath + "../../src/main/java");
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("ysxc");
        globalConfig.setOpen(false);
//        globalConfig.setSwagger2(true);
        globalConfig.setIdType(IdType.ASSIGN_ID);
        globalConfig.setServiceName(CLASS_PREFIX + "%sService");
        globalConfig.setServiceImplName(CLASS_PREFIX + "%sServiceImpl");
        globalConfig.setMapperName(CLASS_PREFIX + "%sMapper");
        globalConfig.setControllerName(CLASS_PREFIX + "%sController");
        return globalConfig;
    }

    /**
     * 包配置
     */
    private PackageConfig packageConfig() {
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName(MODULE_NAME);
        packageConfig.setParent(PACKAGE_NAME);
        return packageConfig;
    }

    /**
     * 自定义模板配置
     */
    private TemplateConfig templateConfig() {
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.disable(TemplateType.XML);
        return templateConfig;
    }

    /**
     * 策略配置
     */
    private StrategyConfig strategyConfig() {
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        // 注释掉下面的即生成所有表
        // strategyConfig.setInclude(INCLUDE);
        strategyConfig.setEntitySerialVersionUID(false);
        strategyConfig.setTablePrefix("sys_", "biz_");
        return strategyConfig;
    }

    /**
     * 自定义配置信息
     */
    private InjectionConfig customerCfg(){
        return new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
//                map.put("enumConfig", ENUMS_CONFIG);
                map.put("controllerUrlPrefix", CONTROLLER_URL_PREFIX);
                this.setMap(map);
            }
        };
    }
}
