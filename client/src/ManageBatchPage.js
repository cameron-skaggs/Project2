

let ManageBatchPage = function() {
    
    

    this.anchorImportBatch = function() {
        return element(by.xpath('//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a'));
    }

    this.buttonImportBatchX = function() {
        return element(by.xpath('//*[@id=\"importBatchModal\"]/div/div/div[1]/button'));
    }

    this.buttonImport = function() {
        return element(by.xpath('//*[@id=\"importBatchModal\"]/div/div/div[3]/input'));
    }

    this.buttonImportClose = function() {
        return element(by.xpath('//*[@id=\"importBatchModal\"]/div/div/div[3]/button'));
    }

    this.modalImport = function() {
        return element(by.xpath('//*[@id=\"importBatchModal\"]'));
    }

    this.anchorCreateBatch = function() {
        return element(by.xpath('//*[@id="manage"]/div[1]/div/div/ul/li[3]/a'));
    } 

    this.buttonCreateBatchClose = function() {
        return element(by.xpath('//*[@id=\"createBatchModal\"]/div/div/div[3]/button'));
    }

    this.buttonCreateBatchSave = function() {
        return element(by.xpath('//*[@id=\"createBatchModal\"]/div/div/div[3]/input'));
    }  

    this.buttonCreateBatchX = function() {
        return element(by.xpath('//*[@id=\"createBatchModal\"]/div/div/div[1]/button'));
    } 

    this.modalCreateBatch = function() {
        return element(by.xpath('//*[@id=\"createBatchModal\"]'));
    } 

    this.inputTrainingName = function() {
        return element(by.xpath('//*[@id="trainingName"]'));
    }  

    this.selectTrainingTypeRevature = function() {
        return element(by.cssContainingText('option', 'Revature')).click();
    }  

    this.selectTrainingTypeCorporate = function() {
        return element(by.cssContainingText('option', 'Corporate')).click();
    }

    this.selectTrainingTypeUniversity = function() {
        return element(by.cssContainingText('option', 'University')).click();
    }

    this.selectTrainingTypeOther = function() {
        return element(by.cssContainingText('option', 'Other')).click();
    }

    this.selectSkillTypeJ2EE = function() {
        return element(by.cssContainingText('option', 'J2EE')).click();
    }

    this.selectSkillTypeNet = function() {
        return element(by.cssContainingText('option', '.NET')).click();
    }

    this.selectSkillTypeSDET = function() {
        return element(by.cssContainingText('option', 'SDET')).click();
    }

    this.selectSkillTypeBPM = function() {
        return element(by.cssContainingText('option', 'BPM')).click();
    }

    this.selectSkillTypeAppianBPM = function() {
        return element(by.cssContainingText('option', 'Appian BPM')).click();
    }

    this.selectSkillTypePEGABPM = function() {
        return element(by.cssContainingText('option', 'PEGA BPM')).click();
    }

    this.selectSkillTypeMicrosoftDynamics365 = function() {
        return element(by.cssContainingText('option', 'Microsoft Dynamics 365')).click();
    }

    this.selectSkillTypeJTA = function() {
        return element(by.cssContainingText('option', 'JTA')).click();
    }

    this.selectSkillTypeMicroservices = function() {
        return element(by.cssContainingText('option', 'Microservices')).click();
    }

    this.selectSkillTypeOracleFusion = function() {
        return element(by.cssContainingText('option', 'Oracle Fusion')).click();
    }

    this.selectSkillTypeSalesForce = function() {
        return element(by.cssContainingText('option', 'Salesforce')).click();
    }

    this.selectSkillTypeBusinessAnalyst = function() {
        return element(by.cssContainingText('option', 'Business Analyst')).click();
    }

    this.selectSkillTypeSystemAdmin = function() {
        return element(by.cssContainingText('option', 'System Admin')).click();
    }

    this.selectSkillTypeQA = function() {
        return element(by.cssContainingText('option', 'QA')).click();
    }

    this.selectSkillTypeOther = function() {
        return element(by.cssContainingText('option', 'Other')).click();
    }
}
module.exports = new ManageBatchPage();