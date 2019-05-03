package com.github.niu.express.server.mybatis;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @date 2019/2/22 10:45
 * @desc
 */
// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {



        public static void main(String[] args) {
            // 代码生成器
            AutoGenerator mpg = new AutoGenerator();

            // 全局配置
            GlobalConfig gc = new GlobalConfig();
            final String projectPath = System.getProperty("user.dir");
            gc.setOutputDir(projectPath + "/niu-express/niu-express-server/src/main/java");
            gc.setAuthor("System");
            gc.setOpen(false);
            gc.setFileOverride(true); //是否覆盖
            mpg.setGlobalConfig(gc);

            // 数据源配置
            DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl("jdbc:mysql://localhost:3306/helpeachother?connectTimeout=1000&useUnicode=true&characterEncoding=utf-8&useSSL=false");
            // dsc.setSchemaName("public");
            dsc.setDriverName("com.mysql.jdbc.Driver");
            dsc.setUsername("root");
            dsc.setPassword("root");
            dsc.setTypeConvert(new MyTypeConvert());
            mpg.setDataSource(dsc);

            // 包配置
            final PackageConfig pc = new PackageConfig();
           // pc.setModuleName(scanner("模块名"));
            /**
             *  最外层的包，比如com.bj58.fanglearning
             */
            pc.setParent("com.github.niu.express.server");
            pc.setController("controller");
            pc.setServiceImpl("service");
            pc.setXml("mapper.xml");
            pc.setEntity("models");
            mpg.setPackageInfo(pc);



            // 策略配置
            StrategyConfig strategy = new StrategyConfig();
            strategy.setNaming(NamingStrategy.underline_to_camel);
            strategy.setColumnNaming(NamingStrategy.underline_to_camel);
            strategy.setEntityLombokModel(false);
            strategy.setRestControllerStyle(false);
            strategy.setInclude("ticket", "boat", "address");

            /**设置生成类的前缀**/
//            strategy.setTablePrefix( "t_");

//            TemplateConfig templateConfig = new TemplateConfig();
//            templateConfig.setController(null);
//            mpg.setTemplate(templateConfig);
            mpg.setStrategy(strategy);
            mpg.execute();
        }

    }
