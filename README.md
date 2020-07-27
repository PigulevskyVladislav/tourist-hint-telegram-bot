# tourist-hint-telegram-bot

## Have to install
- Node.js and npm
https://docs.npmjs.com/downloading-and-installing-node-js-and-npm
- Maven
https://docs.wso2.com/display/IS323/Installing+Apache+Maven+on+Windows
- Java Runtime Environment
https://docs.oracle.com/goldengate/1212/gg-winux/GDRAD/java.htm#BGBFJHAB
- PostgreSQL 11.2 server
https://www.postgresql.org/download/
- pgAdmin 4
https://www.pgadmin.org/download/

## Telegram bot data
Bot Login: tourist_hint_telegram_bot
Bot Token: 1355450414:AAEszl0etR782pNjQ_bKy3hs_L3w-oSZ_Io

## Prelaunch
Before launch application you need to create and fill database.
You can try to do it by launch ***create_data_base.bat*** in database folder.
But if its failed you can copy data from ***dbScritp.sql*** file with same location and execute it with pgAdmin.

## Launch
You need to check that your PostgreSQL server is working.
Then you have to do next steps: 
- At first you need to start ***start.bat*** file in the backend folder.
- Secondary you need to start ***start.bat*** file in the frontend folder.

## Stop
To turn off backend/frontend you need to press **Ctrl + C** combination in termenal which was opened by launch ***start.bat***.


