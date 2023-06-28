package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class CouponsPage {
    public static Target VERIFY_COUPONS_PAGE = Target.the("Verifica si esta en la pagina 'Coupons'").locatedBy("//div[@class='left_nav browseBox']/h3[text()='Your Coupons']");
}
