import styled from "styled-components";

export const MovieItemContainer = styled.div`
  display: flex;
`;

export const Thumbnail = styled.img`
  width: 200px;
  height: 150px;
  border-radius: 10px;
`;

export const ModalContainer = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
`;

export const CloseButton = styled.button`
  align-self: flex-end;
  background-color: transparent;
  width: 30px;
  height: 30px;
  border: none;
  margin-top: 20px;
  margin-right: 20px;
`;

export const MoviePlayerContainer = styled.div`
  margin-top: 12px;
  margin-left: 48px;
  margin-right: 48px;
  margin-bottom: 48px;
`;
