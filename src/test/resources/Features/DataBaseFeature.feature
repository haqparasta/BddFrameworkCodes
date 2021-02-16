Feature: DataBase SQL query Feature Scenario
@testDB
Scenario: Execute all information from Actor Table

Given User connects to PostgreSql DataBase
When User sends query 'select * from public.actor'
Then User should get all information from that table