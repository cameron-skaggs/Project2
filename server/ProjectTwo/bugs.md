Caliber Automation Bugs
===============================================================================

Bug 1
-------------------------------------------------------------------------------------
home https://dev-caliber.revature.tech/
console GET https://dev-caliber.revature.tech/all/reports/batch/112520/pie/ 404 (Not Found)

Bug 2
-------------------------------------------------------------------------------------
home https://dev-caliber.revature.tech/
console There was an error in doughnutChartDataFactory -> batchCurrentWeekQCPie. 404

Bug 3
-------------------------------------------------------------------------------------
home https://dev-caliber.revature.tech/
anchor "Manage Batch"
anchor "Import Batch"
console GET https://dev-caliber.revature.tech/all/batch/import/ 503 (Service Unavailable)

Bug 4
-------------------------------------------------------------------------------------
https://dev-caliber.revature.tech/caliber/#/trainer/manage
home https://dev-caliber.revature.tech/
anchor "Manage Batch"
anchor "Create Batch"
input "Start Date" && input "End Date"
span class glyphicon-calendar <-- unnecessary

Bug 5
-------------------------------------------------------------------------------------
https://dev-caliber.revature.tech/caliber/#/trainer/manage
home
anchor "Manage Batch"
anchor "Create Batch"
anchor "glyphicon-user"
anchor "Add Trainee"
input "Save"
does not save trainee

Bug 6
-------------------------------------------------------------------------------------
https://dev-caliber.revature.tech/caliber/#/trainer/manage
home
anchor "Manage Batch"
assume batch exists
anchor class="glyphicon glyphicon-user"
anchor "Add Trainee"
input id="traineeName", placeholder="http://www.example.com/revature"
input id="traineeName", placeholder="Name"
duplicate id

=============================================================================================
Andrew Ahn, Associate
William Gentry, Trainer
1804 JTA
Revature

andrewsrahn@gmail.com
Last update: May 27, 2018