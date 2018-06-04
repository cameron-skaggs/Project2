describe("Navigate to the Caliber Home page", () =>{
    beforeAll(() =>{
        browser.get("https://dev-caliber.revature.tech");
        browser.sleep(5000);
        browser.navigate().to("https://dev-caliber.revature.tech/caliber/#/trainer/home");
        browser.sleep(5000);
        browser.manage().window().maximize();
    });

    it("should navigate to Trainer Home Page", () => {
        expect(browser.getTitle()).toEqual('Caliber | Performance Management');
    });

    let header = element(by.tagName('h1'));
    it("should say Welcome to Caliber!", () => {
        expect(header.getText()).toBe('Welcome to Caliber!');
    });

    describe("should be able to click on the links", ()=> {
        let myElement = element(by.linkText('Manage Batch'));
        it("should be able to click on Manage Batch link", () => {
            expect(element(by.linkText('Manage Batch')).getTagName()).toBe('a');
            myElement.click();
        });
        let myElement2 = element(by.linkText('Assess Batch'));
        it("should be able to click on Assess Batch link", () => {
            expect(element(by.linkText('Assess Batch')).getTagName()).toBe('a');
            myElement2.click();
        });
        let myElement3 = element(by.linkText('Reports'));
        it("should be able to click on Reports link", () => {
            expect(element(by.linkText('Reports')).getTagName()).toBe('a');
            myElement3.click();
        });
    });
    
});