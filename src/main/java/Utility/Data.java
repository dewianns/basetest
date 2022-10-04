package Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


    class confReader {
        static Properties temp;

        protected static Properties conf() throws IOException {
            Properties prop = new Properties();
            FileReader input = new FileReader("Config.properties");
            prop.load(input);
            temp = prop;
            input.close();
            return temp;
        }
    }

    public class Data extends confReader {
        String urlHrm, urlDemo, fName, lName;

        public Data() {
            try {
                this.temp = conf();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String getUrlHrm() {
            return urlHrm = temp.getProperty("urlHrm");
        }

        public String getUrlDemo() {
            return urlDemo = temp.getProperty("urlDemo");
        }

        public String getfName() {
            return fName = temp.getProperty("fName");
        }

        public String getlName() {
            return lName = temp.getProperty("lName");
        }
    }


