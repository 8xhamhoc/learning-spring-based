package model;

public class Client {

    private DataSourceBean dataSourceBean;

    // Implicit constructor Injection
    public Client(DataSourceBean dataSourceBean) {
        this.dataSourceBean = dataSourceBean;
    }

    public void showData() {
        System.out.println(dataSourceBean.getData());
    }

}
