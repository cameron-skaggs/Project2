describe("Navigate to the Manage Batch page", () => {
    let manage = require("../src/ManageBatchPage.js");

    beforeAll(() =>{
        browser.get("https://dev-caliber.revature.tech");
        browser.sleep(5000);
        browser.navigate().to("https://dev-caliber.revature.tech/caliber/#/trainer/home");
        browser.sleep(5000);
        browser.manage().window().maximize();
        let myElement = element(by.linkText('Manage Batch'));
        myElement.click();
    });

    
    it("should have a table", () => {
        expect(element(by.xpath('//*[@id="manage"]/div[2]/div/div/table')).isPresent()).toBe(true);
    });

    describe("Manage Batch allows for the selection of year ", () => {
        it("should have a drop down for years", () => {
            expect(element(by.className('dropdown')).isPresent()).toBe(true);
        });

        it("should allow you to select 2016", () => {
            element(by.xpath('//*[@id="manage"]/div[1]/div/div/ul/li[1]/ul/li[4]/a')).click();
        });

        it("should allow you to select 2017", () => {
            element(by.xpath('//*[@id="manage"]/div[1]/div/div/ul/li[1]/ul/li[3]/a')).click();
        }); 

        it("should allow you to select 2018", () => {
            element(by.xpath('//*[@id="manage"]/div[1]/div/div/ul/li[1]/ul/li[2]/a')).click();
        });
    });

    describe("Create Batch allows for the creation of batches", () => {
        it("should have a training name input field", () => {
            expect(manage.inputTrainingName().isPresent()).toBe('true');
        });

        it("should allow for the input of training name", () => {
            manage.anchorCreateBatch().click();
            manage.inputTrainingName().sendKeys("JTA 1401");
            expect(manage.inputTrainingName().getText()).toBe('JTA 1401');
        });

        it("should allow you to select training type", () => {
            manage.selectTrainingTypeRevature().click();
            manage.selectTrainingTypeCorporate().click();
            manage.selectTrainingTypeUniversity().click();
            manage.selectTrainingTypeOther().click();
        });

        it("should allow you to select skill type", () => {
            manage.selectSkillTypeJ2EE().click();
            manage.selectSkillTypeNet().click();
            manage.selectSkillTypeSDET().click();
            manage.selectSkillTypeBPM().click();
            manage.selectSkillTypeAppianBPM().click();
            manage.selectSkillTypePEGABPM().click();
            manage.selectSkillTypeMicrosoftDynamics365().click();
            manage.selectSkillTypeJTA().click();
            manage.selectSkillTypeMicroservices().click();
            manage.selectSkillTypeOracleFusion().click();
            manage.selectSkillTypeSalesForce().click();
            manage.selectSkillTypeBusinessAnalyst().click();
            manage.selectSkillTypeSystemAdmin().click();
        });
    });


});