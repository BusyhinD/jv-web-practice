package mate.controller.driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mate.lib.Injector;
import mate.model.Driver;
import mate.service.DriverService;

public class AddDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("mate");
    private static final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/driver/addDriver.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String path = req.getContextPath() + "/drivers";
        resp.sendRedirect(path);
        String name = req.getParameter("name");
        String licenseNumber = req.getParameter("licenseNumber");
        Driver driver = new Driver();
        driver.setName(name);
        driver.setLicenseNumber(licenseNumber);
        driverService.create(driver);
    }
}