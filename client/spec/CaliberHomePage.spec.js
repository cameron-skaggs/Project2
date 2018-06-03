describe("Navigate to the Caliber Home page", () =>{
    beforeAll(() =>{
        browser.get("https://dev-caliber.revature.tech");
        browser.sleep(3000);
        browser.navigate().to("https://dev-caliber.revature.tech/caliber/#/trainer/home");
        browser.sleep(3000);
        browser.manage().window().maximize();
    });

    it("should navigate to Trainer Home Page", () => {
        expect(browser.getTitle()).toEqual('Caliber | Performance Management');
    });

    let header = element(by.tagName('h1'));
    it("should say Welcome to Caliber!", () => {
        expect(header.getText()).toBe('Welcome to Caliber!');
    });

    it("should be able to click on Manage Batch", () => {
        
    });
});