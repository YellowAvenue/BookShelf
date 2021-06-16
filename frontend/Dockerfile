FROM node:12-alpine as build

RUN npm install -g http-server

WORKDIR /app

COPY package*.json ./

# устанавливаем зависимости проекта
RUN npm install

COPY . .

RUN npm run build

EXPOSE 3000
CMD [ "http-server", "-p 3000", "dist" ]