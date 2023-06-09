Reference: https://medium.com/geekculture/understanding-the-chain-of-responsibility-pattern-d729ef84621c

### Problem:
- Assume, there is company that provide a system for employees to request leave, based on several facts. So, the company will consider those facts before approving their leave.
- For example, those might be number of days, employee tier (level), and reason for the leave. Based on these facts, the leave request will forward to a specific person (leave handler), who can handle those requests.
- The person might be a Team Leader, Project Leader, HR, or Manager. If an employee requests a leave for 7 days or less, the Team Leader will handle that request.
- But before approving the leave request Team Leader checks the employee’s tier. If the employee tier is within the acceptable range, then the Team Leader will approve the leave request.
- If an employee requests a leave for 14 days or less, the Team leader cannot handle that request, since he only has authority to approve a leave up to 7 days. In that case the request will be pass to the Project Leader, who have authority to handle that request. Then, he will begin the approval process and its same as the previous one.
- However, in the above scenarios they don’t check the reason for requesting a leave. But when it comes to the HR and Manager level, they will check the reason for requesting a leave. If an employee request up to 21 days, the HR will handle that and if its more than 21 days, the Manager will handle that. 
- When they are handling the request, they will check if the reason is a regular, critical, or special one. Then they will approve or deny the request based on those facts.